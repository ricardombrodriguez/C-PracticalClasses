import java.util.List;

public class Execute extends HelloBaseVisitor<String> {

   @Override public String visitGreetings(HelloParser.GreetingsContext ctx) {
      System.out.println("Olá ");
      for (TerminalNode str : ctx.ID()) {
         System.out.print(str + " ");
      }
      return visitChildren(ctx);
   }

   @Override public String visitBye(HelloParser.ByeContext ctx) {
      System.out.println("Adeus " + ctx.ID());
      return visitChildren(ctx);
   }
}
