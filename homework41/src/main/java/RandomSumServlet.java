import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

@WebServlet("/randomSum")
public class RandomSumServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Random random = new Random();
        PrintWriter out = resp.getWriter();
        int a = random.nextInt(100);
        int b = random.nextInt(100);

        int sum = a + b;

        out.println("<h1>" + a + " + " + b + " = " + sum + "</h1>");
    }
}
