import java.io.Serializable;

public class Productt implements Serializable {

        private int id;
        private String name;
        private double price;
        private int quantity;
        private String mota;

        public Productt() {

        }

        public Productt(int id, String name, double price, int quantity, String mota) {

            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
            this.mota = mota;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public String getMota() {
            return mota;
        }

        public void setMota(String mota) {
            this.mota = mota;
        }

        @Override
        public String toString() {
            return "Productt{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    ", quantity=" + quantity +
                    ", mota='" + mota + '\'' +
                    '}';
        }

    }
