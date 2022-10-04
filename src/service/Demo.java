/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Duc Thanh
 */
public class Demo {
    public static void main(String[] args) {
        String url = "https://tiki.vn/truyen-tranh/c1084?itm_campaign=tiki-reco_UNK_DT_UNK_UNK_featured-categories_UNK_UNK_UNK_MD_batched_CID.1084&itm_medium=CPC&itm_source=tiki-reco&page=1";
        Document doc = null;
        
        try {
            doc = Jsoup.connect(url).userAgent("Jsoup clien").timeout(20000).get();
            Elements elements = doc.select("div.info div.name h3");
            
            for(Element element : elements) {
                System.out.println(element.ownText());
            }
        } catch (IOException ex) {
            Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
