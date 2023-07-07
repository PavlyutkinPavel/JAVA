package patterns.hw31.facade;

class CarFacade {
    private Engine engine;
    private FuelInjector fuelInjector;
    private Ignition ignition;
    private Dashboard dashboard;

    public CarFacade() {
        engine = new Engine();
        fuelInjector = new FuelInjector();
        ignition = new Ignition();
        dashboard = new Dashboard();
    }

    public void startCar() {
        dashboard.showDashboard();
        engine.start();
        fuelInjector.injectFuel();
        ignition.ignite();
        System.out.println("Start driving");
    }

    public void stopCar() {
        engine.stop();
        System.out.println("Stop driving");
    }
}

