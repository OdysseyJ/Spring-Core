package hello.core.lifecycle;

public class NetworkClient {
    private String url;
    public NetworkClient(){
        System.out.println("생성자 호출, ulr = " + url);
        connect();
        call("초기화 연결 메세지");
    }

    public void setUrl(String url) {
        this.url = url;
    }

    //서비스 시작시 호출
    public void connect(){
        System.out.println("connnect" + url);
    }

    public void call(String message){
        System.out.println("call" + url + "message = " + message);
    }

    public void disconnect(){
        System.out.println("close " + url);
    }
}
