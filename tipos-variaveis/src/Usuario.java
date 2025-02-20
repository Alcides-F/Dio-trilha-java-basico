public class Usuario {
  
    public static void main(String[] args) throws Exception{
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV esté ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();
        smartTv.aumentarCanal();

        System.out.println("A TV esté ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);


    }
}
