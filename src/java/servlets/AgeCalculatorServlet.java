package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author allen
 */
public class AgeCalculatorServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
                getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
                
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            String age = request.getParameter("age");
            
            if(age == null || age.equals("")) {
                request.setAttribute("answer", "You must give your current age.");
                
                return;
            }
            
            try {
                int ageUp = Integer.parseInt(age);
                
                request.setAttribute("ageUp", ageUp);
                
                ageUp = ageUp + 1;
                
                request.setAttribute("answer", "Your age next birthday will be " + ageUp);
                
                getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
                    
                return;
            }
            
            catch (Exception e) {

            }
            
            request.setAttribute("answer", "You must give your current age.");
            
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

}
