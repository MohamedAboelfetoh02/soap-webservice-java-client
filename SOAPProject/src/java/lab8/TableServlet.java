/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package lab8;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "TableServlet", urlPatterns = {"/TableServlet"})
public class TableServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) {
            
            MyService service = new MyService();
            
            // Generate the points
            double[] sequence = service.generateLogSequence(10, 1, 3);
            double[] disturbed = service.disturbSequence(sequence, 0.1);
            
            // Start HTML
            out.println("<html><body>");
            out.println("<h2>Generated Points</h2>");
            out.println("<table border='1'>");
            out.println("<tr><th>Point</th><th>Original Value</th><th>Disturbed Value</th></tr>");
            
            for (int i = 0; i < sequence.length; i++) {
                out.println("<tr>");
                out.println("<td>" + (i + 1) + "</td>");
                out.println("<td>" + String.format("%.4f", sequence[i]) + "</td>");
                out.println("<td>" + String.format("%.4f", disturbed[i]) + "</td>");
                out.println("</tr>");
            }
            
            out.println("</table>");
            out.println("</body></html>");
        }
    }
}
