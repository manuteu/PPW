//package padraocompornamentalgof;
//
////import Memento.Caretaker;
////import Memento.Originator;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Teste();
//    }
//
//    private static void Teste() {
//        Mario mario = new Mario();
//        mario.pegarCogumelo();
//        mario.pegarCogumelo();
//        mario.pegarPena();
//        mario.levarDano();
//        mario.pegarFlor();
//        mario.levarDano();
//        mario.levarDano();
//        mario.levarDano();
//
//    }
////
//

//    public void exemploMemento(){
//        Originator originator = new Originator();
//        Caretaker caretaker = new Caretaker();
//        Scanner mementoScanner = new Scanner(System.in);
//
//        int i = 0;
//        int j = 0;
//
//        System.out.println("Ensira um texto: ");
//        originator.setEstado(mementoScanner.nextLine());
//
//        do {
//            System.out.println("Insira mais um texto: ");
//            originator.setEstado(mementoScanner.nextLine());
//            caretaker.add(originator.salvarEstadoEmMemento());
//            j++;
//        } while (j != 3);
//
//        System.out.println("Insira o ultimo texto: ");
//        originator.setEstado(mementoScanner.nextLine());
//
//        System.out.println("Estado atual: " + originator.getEstado());
//
//        do {
//            originator.getEstadoDeMemento(caretaker.get(i));
//            System.out.println(i + "estado:" + originator.getEstado());
//            i++;
//        } while (i != j);
//
//    }
//
//}
