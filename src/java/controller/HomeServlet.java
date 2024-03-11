/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import constant.CommonConst;
import dao.implement.CategoryDAO;
import dao.implement.ProductDAO;
import entity.Category;
import entity.PageControl;
import entity.Product;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 *
 * @author PC
 */
@WebServlet(name = "HomeServlet", urlPatterns = {"/HomeServlet"})
public class HomeServlet extends HttpServlet {

    ProductDAO productDAO = new ProductDAO();
    CategoryDAO categoryDAO = new CategoryDAO();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HomeServelet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HomeServelet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PageControl pageControl = new PageControl();
        List<Product> listProduct = findProductDoGet(request, pageControl);
        //get list the category dao
        List<Category> listCategory = categoryDAO.findAll();
        //set all in the session
        HttpSession session = request.getSession();
        session.setAttribute("listProduct", listProduct);
        session.setAttribute("listCategory", listCategory);
        request.setAttribute("pageControl", pageControl);
        // change into home.jsp
        request.getRequestDispatcher("view/home.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

    private List<Product> findProductDoGet(HttpServletRequest request, PageControl pagecontrol) {
       //pagination
       //get about page
       String pageRaw=request.getParameter("page");
       //valid page such as abc,100000000=>false
       //use try cath to do it
       int page;
        try {
            page=Integer.parseInt(pageRaw);
            //check if the page <=0=> do not exist
            //for all it if situation is page=1
            if (page<=0) {
                page=1;
            }
        } catch (Exception e) {
            page=1;
        }
       
        

       //get ve search
        String actionSearch = request.getParameter("search") == null
                ? "default"
                : request.getParameter("search");
        //get about the list of product dao
        List<Product> listProduct;
        //get ve request URL
        String requestURL=request.getRequestURL().toString();
        //total record
        int totalRecord=0;
        switch (actionSearch) {
            case "category":
                String categoryId = request.getParameter("categoryId");
                totalRecord = productDAO.findTotalRecordByCategory(categoryId);
                listProduct = productDAO.findByCategory(categoryId, page);
                pagecontrol.setUrlPattern(requestURL + "?search=category&categoryId=" + categoryId + "&");
                break;
            case "searchByName":
                String keyword = request.getParameter("keyword");
                totalRecord = productDAO.findTotalRecordByName(keyword);
                listProduct = productDAO.findByName(keyword, page);
                pagecontrol.setUrlPattern(requestURL + "?search=searchByName&keyword=" + keyword + "&");
                break;
            default:
                totalRecord = productDAO.findTotalRecord();
                listProduct = productDAO.findByPage(page);
                pagecontrol.setUrlPattern(requestURL + "?");
        }
        
        //total page
        int totalPage=(totalRecord% CommonConst.RECORD_PER_PAGE)==0
                ?(totalRecord / CommonConst.RECORD_PER_PAGE)
                :(totalRecord / CommonConst.RECORD_PER_PAGE)+1;
        //set the total record,total page,page in pageControl
        pagecontrol.setPage(page);
        pagecontrol.setTotalPage(totalPage);
        pagecontrol.setTotalRecord(totalRecord);
        return listProduct;
    }
}
