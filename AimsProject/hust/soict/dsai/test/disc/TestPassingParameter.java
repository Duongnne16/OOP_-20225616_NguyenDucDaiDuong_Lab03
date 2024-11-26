public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        // Sử dụng mảng để hoán đổi
        DigitalVideoDisc[] dvds = {jungleDVD, cinderellaDVD};
        swap(dvds);
        jungleDVD = dvds[0];
        cinderellaDVD = dvds[1];
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

        // Thay đổi tiêu đề
        jungleDVD = changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }

    public static void swap(DigitalVideoDisc[] dvds) {
        DigitalVideoDisc tmp = dvds[0];
        dvds[0] = dvds[1];
        dvds[1] = tmp;
    }

    public static DigitalVideoDisc changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        return new DigitalVideoDisc(oldTitle);
    }
    class DigitalVideoDisc {
        private String title;
    
        public DigitalVideoDisc(String title) {
            this.title = title;
        }
    
        public String getTitle() {
            return title;
        }
    
        public void setTitle(String title) {
            this.title = title;
        }
    }
    
}

public class DigitalVideoDisc {
    private String title;

    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
