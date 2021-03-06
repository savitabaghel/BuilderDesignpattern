package com.example.BuilderDesignpattern;

public class Computer {
    //required parameters
    private String HDD;
    private String RAM;
    private String gen;

    //optional parameter
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;


    public String getHDD()
    {
        return HDD;
    }
    public String getRAM()
    {
        return RAM;
    }
    public String getGen()
    {
        return gen;
    }
    public boolean isGraphicsCardEnabled()
    {
        return isGraphicsCardEnabled;
    }
    public boolean isBluetoothEnabled()
    {
        return isBluetoothEnabled;
    }
    private Computer(ComputerBuilder builder) {
        this.HDD=builder.HDD;
        this.RAM=builder.RAM;
        this.gen=builder.gen;

        this.isGraphicsCardEnabled=builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled=builder.isBluetoothEnabled;
    }
    public static class ComputerBuilder
    {
        //required parameter
        private String HDD;
        private String RAM;
        private String gen;

        //optional parameter
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String hdd,String ram,String gen)
        {
            this.HDD=hdd;
            this.RAM=ram;
            this.gen=gen;
        }
        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled)
        {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled)
        {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }
        public Computer build()
        {
            return new Computer(this);
        }
    }

}
