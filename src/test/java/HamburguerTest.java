import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HamburguerTest {
    @Test
    void deveRetornarDescricaoHamburguerDeFrango() {
        Hamburguer hamburguer = new Frango();
        assertEquals("Hamburguer de frango", hamburguer.getDescricao());
    }

    @Test
    void deveRetornarDescricaoHamburguerDeFrangoComBacon() {
        Hamburguer hamburguer = new Bacon(new Frango());
        assertEquals("Hamburguer de frango, Bacon extra", hamburguer.getDescricao());
    }

    @Test
    void deveRetornarDescricaoHamburguerDeFrangoComQueijo() {
        Hamburguer hamburguer = new Queijo(new Frango());
        assertEquals("Hamburguer de frango, Queijo extra", hamburguer.getDescricao());
    }

    @Test
    void deveRetornarDescricaoHamburguerDeFrangoComQueijoeBacon() {
        Hamburguer hamburguer = new Bacon(new Queijo(new Frango()));
        assertEquals("Hamburguer de frango, Queijo extra, Bacon extra", hamburguer.getDescricao());
    }

    @Test
    void deveRetornarPrecoHamburguerDeFrango() {
        Hamburguer hamburguer = new Frango();
        assertEquals(17.75, hamburguer.preco());
    }

    @Test
    void deveRetornarPrecoHamburguerDeFrangoComQueijo() {
        Hamburguer hamburguer = new Queijo(new Frango());
        assertEquals(19.75, hamburguer.preco());
    }

    @Test
    void deveRetornarPrecoHamburguerDeFrangoComBacon() {
        Hamburguer hamburguer = new Bacon(new Frango());
        assertEquals(20.25, hamburguer.preco());
    }

    @Test
    void deveRetornarPrecoHamburguerDeFrangoComQueijoeBacon() {
        Hamburguer hamburguer = new Bacon(new Queijo(new Frango()));
        assertEquals(22.25, hamburguer.preco());
    }

    @Test
    void deveRetornarDescricaoHamburguerDeCarne() {
        Hamburguer hamburguer = new Carne();
        assertEquals("Hamburguer de carne", hamburguer.getDescricao());
    }

    @Test
    void deveRetornarDescricaoHamburguerDeCarneComBacon() {
        Hamburguer hamburguer = new Bacon(new Carne());
        assertEquals("Hamburguer de carne, Bacon extra", hamburguer.getDescricao());
    }

    @Test
    void deveRetornarDescricaoHamburguerDeCarneComQueijo() {
        Hamburguer hamburguer = new Queijo(new Carne());
        assertEquals("Hamburguer de carne, Queijo extra", hamburguer.getDescricao());
    }

    @Test
    void deveRetornarDescricaoHamburguerDeCarneComQueijoeBacon() {
        Hamburguer hamburguer = new Bacon(new Queijo(new Carne()));
        assertEquals("Hamburguer de carne, Queijo extra, Bacon extra", hamburguer.getDescricao());
    }

    @Test
    void deveRetornarPrecoHamburguerDeCarne() {
        Hamburguer hamburguer = new Carne();
        assertEquals(23.50, hamburguer.preco());
    }

    @Test
    void deveRetornarPrecoHamburguerDeCarneComQueijo() {
        Hamburguer hamburguer = new Queijo(new Carne());
        assertEquals(25.50, hamburguer.preco());
    }

    @Test
    void deveRetornarPrecoHamburguerDeCarneComBacon() {
        Hamburguer hamburguer = new Bacon(new Carne());
        assertEquals(26.0, hamburguer.preco());
    }

    @Test
    void deveRetornarPrecoHamburguerDeCarneComQueijoeBacon() {
        Hamburguer hamburguer = new Bacon(new Queijo(new Carne()));
        assertEquals(28.0, hamburguer.preco());
    }
    
}