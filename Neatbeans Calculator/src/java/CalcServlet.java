
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;



@WebServlet(urlPatterns={"CalcServlet"})
public class CalcServlet extends HttpServlet {

    /**
     *Processes requests for both HTTP <code> GET </code> and <code> POST </Code>
     * methods
     * 
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a service-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   
    protected void processRequest(HttpServletRequest request,HttpServletResponse response)
            throws ServletException, IOException{
    response.setContentType("text/html;charset=UTF-8");
    try (PrintWriter out = response.getWriter()){
        int a=Integer.parseInt(request.getParameter("t1"));
        int b=Integer.parseInt(request.getParameter("t2"));
        int c=0;
        String op=request.getParameter("btn");
        if(op.equals("+"))
            c=a+b;
        else if(op.equals("-"))
            c=a-b;
        else if(op.equals("*"))
            c=a*b;
        else if(op.equals("/"))
            c=a/b;
        out.println("<b>"+a+op+b+"="+c+"<b>");
            }
    
    }
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response)
            throws ServletException,IOException{
        processRequest(request,response);
}
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response)
            throws ServletException,IOException{
        processRequest(request,response);

}
    @Override
    public String getServletInfo(){
        return "Short description";
    }
}
