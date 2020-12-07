package dz_3;


public enum Sizes {

    XXS("very little") {
        @Override
        public void getDescription() {
            System.out.println("XXS" +getDescriptoin());
        }
    },
    XS("little") {
        @Override
        public void getDescription() {
            System.out.println("XS"+getDescriptoin());
        }
    },
    S("small") {
        @Override
        public void getDescription() {
            System.out.println("S"+getDescriptoin());
        }
    },
    M("Medium") {
        @Override
        public void getDescription() {
            System.out.println("M"+getDescriptoin());
        }
    },
    L("Large") {
        @Override
        public void getDescription() {
            System.out.println("L"+getDescriptoin());
        }
    };


    private String descriptoin;
    int euroSize;

    Sizes(int euroSize) {
        this.euroSize = euroSize;
    }

    public abstract void getDescription();

    Sizes(String descriptoin) {
        this.descriptoin = descriptoin;
    }

    public String getDescriptoin() {
        return descriptoin;
    }

    public void setDescriptoin(String descriptoin) {
        this.descriptoin = descriptoin;
    }
}
