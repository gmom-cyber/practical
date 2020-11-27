package ru.mirea.exercise25and26;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class ex1 {
        public ex1() {
            Document document = null;

            try {
                document = Jsoup.connect("https://www.moscowmap.ru/metro.html#lines").userAgent("Chrome/4.0.249.0 Safari/532.5").referrer("http://www.google.com").get();
            } catch (IOException var11) {
                var11.printStackTrace();
            }

            JsonObject result = new JsonObject();
            JsonObject station = new JsonObject();
            JsonArray lines = new JsonArray();
            result.add("stations", station);
            result.add("lines", lines);
            Elements stations = document.select("div.js-metro-stations");
            Iterator var6 = stations.iterator();

            while(var6.hasNext()) {
                Element stat = (Element)var6.next();
                JsonArray st = new JsonArray();
                Iterator var9 = stat.select("span.name").iterator();

                while(var9.hasNext()) {
                    Element el = (Element)var9.next();
                    st.add(el.text());
                }

                station.add(stat.attr("data-line"), st);
            }

            Elements lnes = document.select("span.js-metro-line");
            Iterator var13 = lnes.iterator();

            while(var13.hasNext()) {
                Element line = (Element)var13.next();
                JsonObject el = new JsonObject();
                el.addProperty("number", line.attr("data-line"));
                el.addProperty("name", line.text());
                lines.add(el);
            }

            this.saveJSON(result.toString());
            this.openJSON();
        }

        public void saveJSON(String json) {
            try {
                FileWriter writer = new FileWriter("metro.json", false);
                Throwable var3 = null;

                try {
                    writer.write(json);
                    writer.flush();
                } catch (Throwable var13) {
                    var3 = var13;
                    throw var13;
                } finally {
                    if (writer != null) {
                        if (var3 != null) {
                            try {
                                writer.close();
                            } catch (Throwable var12) {
                                var3.addSuppressed(var12);
                            }
                        } else {
                            writer.close();
                        }
                    }

                }
            } catch (IOException var15) {
                var15.printStackTrace();
            }

        }

        public void openJSON() {
            String json = "";

            try {
                FileReader reader = new FileReader("metro.json");
                Throwable var3 = null;

                try {
                    int c;
                    try {
                        while((c = reader.read()) != -1) {
                            json = json + (char)c;
                        }
                    } catch (Throwable var13) {
                        var3 = var13;
                        throw var13;
                    }
                } finally {
                    if (reader != null) {
                        if (var3 != null) {
                            try {
                                reader.close();
                            } catch (Throwable var12) {
                                var3.addSuppressed(var12);
                            }
                        } else {
                            reader.close();
                        }
                    }

                }
            } catch (IOException var15) {
                var15.printStackTrace();
            }

            JsonObject jsonObject = (new JsonParser()).parse(json).getAsJsonObject();
            JsonObject stations = (JsonObject)jsonObject.get("stations");
            System.out.println("Количество станций на каждой линии: ");
            Iterator var18 = stations.keySet().iterator();

            while(var18.hasNext()) {
                String key = (String)var18.next();
                System.out.format("%s: %s\n", key, ((JsonArray)stations.get(key)).size());
            }

        }
    }
}
