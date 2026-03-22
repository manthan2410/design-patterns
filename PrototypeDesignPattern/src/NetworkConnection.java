public class NetworkConnection implements Cloneable {

    private String ip;
    private  String data;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void loadData() throws InterruptedException {
        this.data="data got loaded";
      Thread.sleep(5000);
        return;
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + this.ip + '\'' +
                ", data='" + this.data + '\'' +
                '}';
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
