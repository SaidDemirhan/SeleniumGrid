package org.example;

public class SeleniumGridKonuAnlatimi {
    /*
    SELENIUM GRID 3 DERS NOTLARI 24/11/2021 BATCH 30

PARALEL TESTİ NASIL YAPARSINIZ?
1) TestNG xml files
2) Cucumber -> Maven SureFire Plugin
3) Selenium Grid

SELENIUM GRID KULLANDIN MI? NEREDE KULLANDIN?
Evet Kullandım. Paralel Test ve Cross Browser Test yaparken.

CROSS BROWSER TEST NEDİR?
Bir application'ın bir çok browser'da çalışıp çalışmadığını test etmek.

PARALEL TEST NEDİR?
Testleri aynı anda çalıştırma.

HUB NEDİR?
Ağdaki tüm makineleri kontrol eden yönlendiren merkezdir.
Kullanıcın isteklerini alır, o isteklere uygun makinalara kodlarımızı gönderir ve çalıştırır. Makineler ile iletişim için JSON kullanır.

NODE NEDİR?
Kodlarımızı çalıştırmak için oluşturduğumuz sanal makina ortamı.

SELENIUM GRID'DE HANGİ DRIVER'I KULLANIYORSUN?
RemoteWebDriver Class kullanılır.


Desired Capabilities İÇİNDE NE VAR?
1) İşletim sistemini
2) Browser ismi
3) Browser Version
bunlara Desired Capabilities denilir (istenen özellikler).


SELENIUM GRID3 KURULUM
1) C:\ sürücüsünde Grid3 isminde bir dosya olusturun.

2) C:\Grid3 dosyasının içine selenium-server-standalone.jar dosyasını kopyalayın.

3) Crome browserınızın versiyonunu kontrol edin 96.0.4664.45

4) https://chromedriver.chromium.org/ adresine gidip 96.0.4664.45 versiyonunu indirip C:\Grid3 dosyasının içine kopyalayın.

5) Terminali açın C:\Grid3
"java -jar selenium-server-standalone.jar -role hub" bu kodu yazın

C:\Grid3>java -jar selenium-server-standalone.jar -role hub
enter

6) "Selenium Grid hub is up and running" mesajını almanız lazım.

NOT: http://192.168.43.151:4444 ADRESLER BİLGİSAYARDAN BİLGİSAYARA DEĞİŞİR
KENDİ BİLGİSAYARINIZ OLUSTURDUĞU ADRTESLERİ KULLANIN

7) Nodes should register to http://192.168.43.151:4444/grid/register/

Olusturacağımız nodu bu adrese "http://192.168.43.151:4444/grid/register/" bağlamalısınız

8) Clients should connect to http://192.168.43.151:4444/wd/hub
Kullanıcının "http://192.168.43.151:4444/wd/hub" bu adrese gitmesi lazım

9) Chrome browser'ı aç adres olarak http://192.168.43.151:4444 yaz ve enter.

9) 2. bir CMD ekranı açın. C:\Grid3>

10) "java -Dwebdriver.chrome.driver="C:\Grid3\chromedriver.exe" -jar selenium-server-standalone.jar -role node -hub http://192.168.43.151:4444/grid/register/" KODUNU YAZIN ENTER.

11) C:\Grid3>java -Dwebdriver.chrome.driver="C:\Grid3\chromedriver.exe" -jar selenium-server-standalone.jar -role node -hub http://192.168.43.151:4444/grid/register/

12) Selenium Grid node is up and ready to register to the hub
Node'ın hub'a bağlandığı mesajını görün. ilk node'u oluşturduk.

13) Chrome'u açın oluşturduğumuz Hub'ta console tıklayın ve node'u görün.

13) Şimdi 2. nodu oluşturmak için 3. bir CMD ekranı açın C:\Grid3>

14) "java -Dwebdriver.chrome.driver="C:\Grid3\chromedriver.exe" -jar selenium-server-standalone.jar -role node -hub http://192.168.43.151:4444/grid/register/" KODUNU YAZIN ENTER.

15) C:\Grid3>java -Dwebdriver.chrome.driver="C:\Grid3\chromedriver.exe" -jar selenium-server-standalone.jar -role node -hub http://192.168.43.151:4444/grid/register/

16) Selenium Grid node is up and ready to register to the hub
Node'ın hub'a bağlandığı mesajını görün. 2. node'uda oluşturduk.

17) Chrome'u açın REFRESH yapın. Oluşturulan 2. node'uda görün.

ÇALIŞTIRACAĞIMIZ KODLARI YAZMAYA BAŞLAMAK İÇİN PROJE OLUŞTURALIM
1) IntelliJ'yi açın.

2) File -> New Project

3) Maven'ı seç

4) Create from archetype'a tikla

5) maven-archetype-quickstart'ı seç

6) Add ArcheType
Group Id => com.SeleniumGrid
Artifactld => SeleniumGrid
Version => 1.0
NeXt'E TIKLA

7) Name => SeleniumGrid

8) pom.xml'i aç. Aşağıdaki dependency'leri ekle

    <dependency>
      <groupId>org.seleniumhq.selenium</groupId>
      <artifactId>selenium-java</artifactId>
      <version>3.141.59</version>
    </dependency>

    <dependency>
      <groupId>org.testng</groupId>
      <artifactId>testng</artifactId>
      <version>7.1.0</version>
    </dependency>


KODUMUZU YACMAK İÇİN CLASS OLUŞTURALIM.


package org.example;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;


public class GridTest {

    public static void main(String[] args) throws MalformedURLException {

        //1) Desired Capabilities OLUSTUR.
        DesiredCapabilities cap = new DesiredCapabilities();

        //Desired Capabilities içerisine 3 şey tanımlayabiliriz

        //a) browser
        cap.setBrowserName("chrome");

        //b) işletim sistemi

        cap.setPlatform(Platform.WINDOWS);

        //c) browser version
        //cap.setVersion("96.0.4664.45");

        //2) Chrome Options olustur
        ChromeOptions options = new ChromeOptions();
        options.merge(cap);

        String hubUrl = "http://192.168.43.151:4444/wd/hub";
        WebDriver driver = new RemoteWebDriver(new URL(hubUrl),options);

        driver.get("https://www.google.com/");

        System.out.println(driver.getTitle());

    }
}

     */
}
