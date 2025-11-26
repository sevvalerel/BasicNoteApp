BasicNoteApp (Basit Not Uygulaması)

Bu proje Mobil Programlama dersi ödevi olarak geliştirilmiştir.
Amacı, temel not alma işlevlerini göstermek ve Android geliştirme pratiği yapmaktır.


Genel Bakış

BasicNoteApp, kullanıcıların hızlıca not alabileceği ve saklayabileceği basit bir Android uygulamasıdır.


Özellikler:
Yeni not ekleyebilme

Mevcut notları görüntüleyebilme

Notları güvenli şekilde silebilme


Öne Çıkan Özellikler
Kalıcı Kayıt (Persistence): SharedPreferences kullanılarak notlar cihaz hafızasında saklanır.

Hızlı Not Ekleme: “+” butonu ile mevcut metnin sonuna yeni bir not eklenebilir.

Güvenli Silme: Not silme işlemi öncesinde AlertDialog ile kullanıcıdan onay alınır.

Sade ve Kullanıcı Dostu Arayüz: LinearLayout ve EditText ile basit ve anlaşılır tasarım.

Responsive Tasarım: Butonlar ve yazı alanı farklı ekran boyutlarına uyum sağlar.


Kodun Önemli Kısımları
MainActivity.java: Uygulamanın merkezi, kullanıcı etkileşimlerini ve veri kaydını yönetir.

SharedPreferences: Notları kalıcı olarak saklar ve uygulama açıldığında yükler.

AlertDialog: Not silme işlemleri için kullanıcıya güvenli onay mekanizması sunar.

EditText & Append: Kullanıcı yazdığı metni ekrana yansıtır ve yeni notlar eklenebilir.
