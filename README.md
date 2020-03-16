GELİŞTİRİLEN YAZILIM


İşe ilk önce sesli harfleri, web sitelerini tespit etmek için kullanacağım girdileri tanımlamakla başladım. 
Sesli harfler tek karakterli girdiler olacağı için bir char dizisi şeklinde tanımladım. Web sitesi uzantılarını tutmam gerektiği için 
" .web.tr, .com.tr gibi" uygun olarak string tipinde tanımladım. Daha sonra integer tipinde saydırmak istediğim şeylerin değişkenlerini 
oluşturdum.

File tipinde ismi file olan bir nesne yaratıp Scanner yardımıyla gerekli dosya uzantısındaki “içerik.txt” isimli metin belgesini
çalışmama ekledim. Scanner satır okumasıyla tüm satırları bir while döngüsünde okuttum. Bunlar gerçekleşirken kodun başında tanımladığım 
theString isimli string tipindeki değişkenime okunanları ekledim. Bu while döngüsünde bir string methodu olan içermek anlamına gelen 
contains methodunu kullanarak if statementları içersinde cümleleri, web sitelerini, e-mailleri saydırdım.
Sesli harf saydırmak için bana kolay gelen ve pratik olarak theString ismiyle okuttuğum girdileri charArray ismindeki bir char
dizisine dönüştürüp ekledim. Bu char arrayin içinde bir for döngüsünde gezdim. Her karakteri bir for döngüsü daha kullanarak önceden
tanımladığım sesli harflerle karşılaştırdım. Burada string methodlarından equals'ı kullandım. Eğer eşite sayaç işledi. Devamında 
boşlukları gözeterek kelimeleri saydırdım.En son kısımda da sayaçları ekrana bastırdım. Kodum kısaca bu şekilde çalışıyor,
teşekkür ederim.



ÇIKTILAR


Kelimelerden sonra boşluk gelecek şekilde dizayn edidi. Cümlelerin sonunda nokta ve noktadan sonra bir boşluk olması gerekmekte.

Örnek çıktı 1.1

f****@s****.edu.tr(hocanın maili vermeyelim patlarız) sakarya.edu.tr www.google.com Esentepe 
Kampüs sakarya.com iletisim@ford bu bir pdp ödevidir. 
Sesli Harf Sayisi :38
Kelime Sayisi :12
Websitesi Sayisi :3
Mail Sayisi :1
Cumle Sayisi :1
