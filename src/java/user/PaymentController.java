/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package user;

import entity.Order;
import entity.OrderDetails;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author PC
 */
public class PaymentController extends HttpServlet {

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
            out.println("<title>Servlet PaymentController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PaymentController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("view/user_use/payment/cart.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action") == null
                ? ""
                : request.getParameter("action");
        switch (action) {
            case "add-product":
                addProduct(request, response);
                break;
            case "change-quantity":
                changeQuantity(request, response);
                break;
            case "delete":
                delete(request, response);
                break;
            default:
                throw new AssertionError();
        }
        response.sendRedirect("payment");

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void addProduct(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //get ve session
        HttpSession session = request.getSession();
        //get ve product id
        int id = Integer.parseInt(request.getParameter("id"));
        //get ve quantity
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        //lay ve cart tren session
        Order cart = (Order) session.getAttribute("cart");
        if (cart == null) {
            cart = new Order();
        }
        OrderDetails od = new OrderDetails();
        od.setProductId(id);
        od.setQuantity(quantity);
        //them orderdetails vao trong cart
        addOrderDetailsToOrder(od, cart);
        //set cart moi len seasion
        session.setAttribute("cart", cart);
        response.sendRedirect("payment");
    }

    private void addOrderDetailsToOrder(OrderDetails od, Order cart) {
        boolean isAdd = false;
        for (OrderDetails obj : cart.getListOrderDetails()) {
            if (obj.getProductId() == od.getProductId()) {
                obj.setQuantity(obj.getQuantity() + od.getQuantity());
                isAdd = true;
            }
        }
        if (isAdd == false) {
            cart.getListOrderDetails().add(od);
        }
    }

    private void changeQuantity(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        try {
            //get ve product id
            int id = Integer.parseInt(request.getParameter("id"));
            //get ve quatity
            int quantity = Integer.parseInt(request.getParameter("quantity"));
            //lay ve cart

            Order cart = (Order) session.getAttribute("cart");
            //thay doi quantity
            for (OrderDetails obj : cart.getListOrderDetails()) {
                if (obj.getProductId() == id) {
                    obj.setQuantity(quantity);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void delete(HttpServletRequest request, HttpServletResponse response) {
       //get about id
       int id=Integer.parseInt(request.getParameter("id"));
       HttpSession session=request.getSession();
       Order cart=(Order) session.getAttribute("cart");
       OrderDetails od=null;
        for (OrderDetails obj : cart.getListOrderDetails()) {
            if (obj.getProductId()==id) {
                od=obj;
            }
        }
        cart.getListOrderDetails().remove(od);
        session.setAttribute("cart", cart);
    }

}
