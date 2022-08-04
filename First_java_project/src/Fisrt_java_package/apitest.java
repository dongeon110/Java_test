/* Java 1.8 샘플 코드 */
package Fisrt_java_package;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.io.BufferedReader;
import java.io.IOException;

public class apitest {
    public static void main(String[] args) throws IOException {
        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1611000/nsdi/map/BldgisSpceService"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=%2FLtYjT36wNBD6mdPblHWA%2FHa8cpFQR4beapAQNIGU2PRekaXcYhWSH4i%2B7FtgSe%2FxppVeQdmt1FRaZrdjxqC1g%3D%3D"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("layers","UTF-8") + "=" + URLEncoder.encode("8", "UTF-8")); /*화면에 표출할 레이어명의 나열, 값은 쉼표로 구분*/
        urlBuilder.append("&" + URLEncoder.encode("crs","UTF-8") + "=" + URLEncoder.encode("EPSG:5174", "UTF-8")); /*좌표 체계(산출물을 위한 SRS)*/
        urlBuilder.append("&" + URLEncoder.encode("bbox","UTF-8") + "=" + URLEncoder.encode("215098.77819354858,451385.7301935477,215353.29432258086,451575.7947096767", "UTF-8")); /*크기(extent)를 정의하는 범위(bounding box)*/
        urlBuilder.append("&" + URLEncoder.encode("width","UTF-8") + "=" + URLEncoder.encode("915", "UTF-8")); /*반환 이미지의 너비(픽셀)*/
        urlBuilder.append("&" + URLEncoder.encode("height","UTF-8") + "=" + URLEncoder.encode("700", "UTF-8")); /*반환 이미지의 높이(픽셀)*/
        urlBuilder.append("&" + URLEncoder.encode("format","UTF-8") + "=" + URLEncoder.encode("image/png", "UTF-8")); /*반환 이미지 형식(image/png 또는 image/jpeg 또는 image/gif)*/
        urlBuilder.append("&" + URLEncoder.encode("transparent","UTF-8") + "=" + URLEncoder.encode("false", "UTF-8")); /*반환 이미지 배경의 투명 여부(true 또는 false[기본값])*/
        urlBuilder.append("&" + URLEncoder.encode("bgcolor","UTF-8") + "=" + URLEncoder.encode("0xFFFFFF", "UTF-8")); /*반환 이미지의 배경색(0xRRGGBB)*/
        urlBuilder.append("&" + URLEncoder.encode("exceptions","UTF-8") + "=" + URLEncoder.encode("blank", "UTF-8")); /*예외 발생 시 처리 방법(blank 또는 xml 또는 inimage)*/
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println(urlBuilder);
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        System.out.println(sb.toString());
    }
}