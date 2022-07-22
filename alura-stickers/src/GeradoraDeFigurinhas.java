import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class GeradoraDeFigurinhas {;

    public void criar(InputStream inputStream, String nome_arquivo, String frase) throws Exception{

        // leitura imagem
        // InputStream inputStream = new FileInputStream(new File("entrada/entrada.jpg"));
        // String url =  "https://imersao-java-apis.s3.amazonaws.com/TopTVs_2.jpg";
        // InputStream inputStream = new URL(url).openStream();
        BufferedImage imagemOriginal = ImageIO.read(inputStream);
        
        // criar nova imagem
        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        int novaAltura = altura + 200;
        BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);


        //copiar imagem original para a nova
        Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
        graphics.drawImage(imagemOriginal, 0, 0, null);

        //configurar a fonte
        var fonte = new Font(Font.SANS_SERIF, Font.BOLD, 64);
        graphics.setColor(Color.PINK);
        graphics.setFont(fonte);

        //escrever uma frase na nova imagem
        graphics.drawString(frase, 100, novaAltura-100);

        //escrever a nova imagem em um arquivo
        ImageIO.write(novaImagem, "png", new File("saida", nome_arquivo));

    }

    // public static void main(String[] args) throws Exception {
    //     GeradoraDeFigurinhas gerador = new GeradoraDeFigurinhas();
    //     gerador.criar();
    // }
}
