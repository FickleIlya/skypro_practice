package Core.lessonOOP2;

public abstract class Transport {
    private String modelName;
    private int wheelsCount;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    protected void updateTyre(){
            System.out.println("Меняем покрышку");
    }
    protected abstract void checkEngine();
    protected abstract void checkTrailer();
}
