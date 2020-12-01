class ProjectTest {
    public static void main(String[] args) {
        Project p = new Project();
        p.elevatorPitch();
        p.setName("Kenobi's Tale");
        p.setDesc("A really cute project");
        String pName = p.getName();
        String pDesc = p.getDesc();
        System.out.println("Project object - Name: " + pName + ", Description: " + pDesc);
        Project p1 = new Project("Kilo's Story", "The cutest story of all");
        System.out.println("Project object - Name: " + p1.getName() + ", Description: " + p1.getDesc());
        Project p2 = new Project("Desmond's Disaster");
        System.out.println("Project object - Name: " + p2.getName() + ", Description: " + p2.getDesc());
        Project p3 = new Project("Matt's Adventure", "A really good adventure", 20.0);
        p3.elevatorPitch();
    }
}