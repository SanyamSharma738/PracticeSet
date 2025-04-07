//Running two threads at a same time. where im showing File is being downloaded
// while user is scrolling through a webpage
// Also Music is Playing in the background
class FileDownload extends Thread{
    public void run() {
        for (int i =1;i<=5;i++){
            System.out.println("File is Downloading "+i*20+"%");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Download Complete");
    }
}
class Scrolling extends Thread{
    public void run() {
        for (int i=1;i<=5;i++){
            System.out.println("Scrolling through Webpage");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class MusicPlay implements Runnable{

    public void run() {
        for (int i =1;i<=3;i++){
            System.out.println("Music is Playing....");
            try {
                Thread.sleep(750);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}

public class FirstProgram {
    public static void main(String[] args) {
        FileDownload fileDownload = new FileDownload();
        Scrolling scrolling = new Scrolling();
        fileDownload.start();
        scrolling.start();
        MusicPlay mup=new MusicPlay();
        Thread t1 = new Thread(mup);
        t1.start();
    }
}
