import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Google g=new Google();
        LinkedInExtractor linkedIn=new LinkedInExtractor();
        String link=g.FindOnLinkedIn("maduranga siriwardena");             // insert name here
        System.out.println(link);
        linkedIn.Extract(link);
    }
}
