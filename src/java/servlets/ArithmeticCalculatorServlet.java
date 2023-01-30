
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
public class ArithmeticCalculatorServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String first = request.getParameter("first");
        
        String second = request.getParameter("second");
        
        String operator = request.getParameter("operator");
        
        if ((first == null || first.equals("") && (second == null) || second.equals(""))) {
                
            request.setAttribute("answer", "Result: ---");
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            
            return;
            }
        
        try {
            
            request.setAttribute("first", first);
            
            request.setAttribute("second", second);
            
            int firstNum = Integer.parseInt(first);
            
            int secondNum = Integer.parseInt(second);
            
            int answer = 0;
            
            if(operator.equals("+")){
                
                answer = firstNum + secondNum;
                
            }
            
            if(operator.equals("-")){
                
                answer = firstNum - secondNum;
                
            }
                        
            if(operator.equals("*")){
                
                answer = firstNum * secondNum;
                
            }
                                    
            if(operator.equals("%")){
                
                answer = firstNum % secondNum;
                
            }
            
            request.setAttribute("answer", "Result: " + answer );
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            
            return;
            
        }
        
        catch (Exception e) {
            
            request.setAttribute("first", first);
            
            request.setAttribute("second", second);
            
            request.setAttribute("answer", "Result: invalid");
        }
            
    }


}
