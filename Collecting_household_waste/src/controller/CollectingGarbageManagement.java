/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
    package controller;

    import model.GarbageTruck;
    import respository.CollectingGarbageRepository;
    import respository.ICollectingGarbageRepository;
    import view.Menu;

    /**
     *
     * @author ADMIN
     */
    public class CollectingGarbageManagement extends Menu<String>{
        private ICollectingGarbageRepository garbageRepository;
        static String[] options = {"Input", "Print", "Exit"};
        GarbageTruck g;
        public CollectingGarbageManagement() {
            super("===== COLLECTING GARBAGE MANAGEMENT =====", options);
            garbageRepository = new CollectingGarbageRepository();
            g = new GarbageTruck();
        }

        @Override
        public void execute(int n) {
    switch (n) {
        case 1:
            garbageRepository.getInput(g);
            break;
        case 2:
            garbageRepository.printTheCost(g);
            break;
        case 3:
            System.exit(0);
            break;
        default:
            System.out.println("Invalid option");
            break;
    }
        }
    }