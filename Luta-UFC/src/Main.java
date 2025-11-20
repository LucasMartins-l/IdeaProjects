
public class Main {
    public static void main(String[] args) {
        Lutadores[] lutadores = new Lutadores[15];

        lutadores[0] = new Lutadores("Carlos Silva", "'Touro'","São Paulo", 28, 1.82, 83.5,  20, 3, 1);
        lutadores[1] = new Lutadores("Rafael Souza", "'Relâmpago'","Rio de Janeiro", 26, 1.75, 69.0, 17, 2, 0);
        lutadores[2] = new Lutadores("Lucas Almeida", "'Pedra'","Minas Gerais", 31, 1.90, 91.3, 22, 4, 2);
        lutadores[3] = new Lutadores("João Pereira", "'Gigante'","Bahia", 34, 1.95, 105.0,  30, 5, 0);
        lutadores[4] = new Lutadores("Diego Mendes", "'Falcão'","Paraná", 23, 1.70, 61.8,  18, 1, 1);
        lutadores[5] = new Lutadores("Marcos Oliveira", "'Pantera'", "Pernambuco", 29, 1.78, 75.4, 19, 3, 1);
        lutadores[6] = new Lutadores("Eduardo Lima", "'Trovão'", "Rio Grande do Sul", 32, 1.88, 89.6, 25, 6, 0);
        lutadores[7] = new Lutadores("Thiago Ramos", "'Furacão'", "Ceará", 27, 1.80, 78.3, 21, 2, 2);
        lutadores[8] = new Lutadores("Bruno Castro", "'Tigre'", "Amazonas", 25, 1.74, 68.5, 15, 4, 0);
        lutadores[9] = new Lutadores("Felipe Rocha", "'Lobo'", "Distrito Federal", 30, 1.85, 82.1, 24, 3, 1);
        lutadores[10] = new Lutadores("André Nunes", "'Rinoceronte'", "Espírito Santo", 35, 1.92, 118.0, 28, 7, 1);
        lutadores[11] = new Lutadores("Ricardo Vieira", "'Fantasma'", "Goiás", 24, 1.73, 65.9, 16, 1, 1);
        lutadores[12] = new Lutadores("Pedro Carvalho", "'Martelo'", "Santa Catarina", 29, 1.87, 85.0, 23, 5, 2);
        lutadores[13] = new Lutadores("Gustavo Freitas", "'Cascavel'", "Mato Grosso", 33, 1.79, 71.2, 19, 3, 0);
        lutadores[14] = new Lutadores("Leonardo Duarte", "'Fera'", "Maranhão", 22, 1.68, 59.4, 12, 1, 1);



        Luta luta = new Luta();

        luta.marcarLuta(lutadores[5] , lutadores[7]);
        luta.lutar();
    }
}