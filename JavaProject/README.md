# patika.dev Java101 Bitirme Projesi
## MineSweeper Game

Oyun Kuralları :
* Oyun metin tabanlıdır.
* Çift boyutlu diziler üzerinden oynanmalı ve MineSweeper sınıfı içerisinde tasarlanmalı.
* Matris boyutunu yani satır ve sütun sayısını kullanıcı belirlemeli.
* Diziye ait eleman sayısının çeyreği (elemanSayisi / 4) kadar rastgele mayın yerleştirilmeli. Örneğin dizi 4x3 boyutunda ise eleman sayısı (satırSayısı * sütunSayısı) formülü ile hesaplanmalı ve boyutu 12 olmalı. Bu durumda mayın sayısı 12 / 4 = 3 adet olmalıdır. (ipucu : bu mayınların konumlarını tutacak ikinci bir dizi oluşturabilirsiniz.)
* Kullanıcı matris üzerinden bir nokta seçmeli. Nokta seçimi için satır ve sütun değerlerini girmeli.
* Seçilen noktanın dizinin sınırları içerisinde olup olmadığını kontrol edilmeli ve koşul sağlanmazsa tekrar nokta istenmeli.
* Kullanıcının girdiği noktada mayın var ise oyunu kaybetmeli.
* Mayın yok ise, ilgili noktaya değen tüm konumlarına bakılmalı (sağı, solu, yukarısı, aşağısı, sol üst çapraz, sağ üst çapraz, sağ alt çapraz, sol alt çapraz) ve etrafındaki mayınların sayısının toplamı ilgili noktaya yazılmalı. Noktaya değen herhangi bir mayın yok ise "0" değeri atanmalı.
* Kullanıcı hiç bir mayına basmadan tüm noktaları seçebilirse oyunu kazanmalı.

Kod içerisinde bulunan bazı metodlar ve constructor'ların açıklamaları:

**MineSweeper(int rows, int cols, int numMines)**: Mayın Tarlası oyununu temsil eden class'ın constructor'ıdır. Oyun tahtasının boyutu (rows ve cols), mayın sayısı (numMines) gibi özellikleri ayarlar, tahta ve mayınlar için gerekli matrisleri oluşturur ve mayınları yerleştirir. Ayrıca oyunun henüz bitmediği (gameOver = false) ve kaç hücrenin kaldığı (remainingCells) bilgisini ayarlar.

**placeMines()**: Mayınları rastgele olarak oyun tahtasına yerleştiren bir metottur. Random sınıfını kullanarak tahtanın rastgele bir hücresine mayın yerleştirir ve mayın sayısı (count) belirli bir sayıya (numMines) ulaşıncaya kadar bu işlemi tekrarlar.

**calculateNumbers()**: Oyun tahtasındaki her hücre için etrafındaki mayın sayısını hesaplayan bir metottur. Hücrenin bir mayın olup olmadığına (mines[i][j]) bakar ve etrafındaki hücrelerdeki mayın sayısını (count) hesaplar. Sonuçları board matrisine kaydeder.

**play()**: Oyunun oynanışını sağlayan bir metottur. Oyun tahtasını (printBoard()), kullanıcıdan alınan girişi (Scanner sınıfı ile row ve col değişkenlerine okur), girdinin geçerli olup olmadığını ve daha önce seçilip seçilmediğini kontrol eder. Eğer seçilen hücre bir mayınsa oyunu kaybeder (gameOver = true) ve aksi takdirde seçilen hücreyi açar (revealCell(row, col)) ve oyunun bitip bitmediğini kontrol eder.

**revealCell(int row, int col)**: Seçilen hücreyi açan ve diğer hücrelerin de açılmasını sağlayan bir metottur. Hücreyi açar (revealed[row][col] = true) ve kalan hücre sayısını (remainingCells) azaltır. Eğer açılan hücre etrafında hiçbir mayın yoksa, etrafındaki diğer hücreleri de açar (revealCell(i, j)).

**printBoard()**: Oyun tahtasını konsola yazdıran bir metottur. Matrisleri kullanarak tahtayı şekillendirir ve açılmış olan hücreleri (revealed[i][j]) ve hücrelerdeki mayınları (mines[i][j]) gösterir. Ayrıca tahtanın her bir hücresine koordinatlarını da ekler.

**main(String[] args)**: Programın çalıştığı ana metoddur. Kullanıcıdan satır ve sütun sayısı bilgilerini alır ve MineSweeper sınıfından bir nesne oluşturur. Oluşturulan nesne üzerinde play() metodunu çağırarak oyunu başlatır.
