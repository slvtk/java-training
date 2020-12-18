package parser;


import codewars.four.TopWords;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
//parsing javarush topics and finding top 3 words
public class HTMLTopParser {
    public static void main(String[] args) {
        Document document;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            document = Jsoup.connect("https://javarush.ru/groups/posts/2351-znakomstvo-so-string-stringbuffer-i-stringbuilder-v-java").get();
            Elements elements = document.getElementsByClass("content content--raw");
            for (Element elem :
                    elements) {
                stringBuilder.append(elem.text());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(TopWords.top3(stringBuilder.toString()));
    }
}
