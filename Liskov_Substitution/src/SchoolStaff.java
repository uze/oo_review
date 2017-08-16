
public class SchoolStaff {

        private void makeAnnouncements() {
            System.out.println("Making announcement...");
        }

        private void takeAttendence() {
            System.out.println("Taking attendence...");
        }

        private void collectPaperWork() {
            System.out.println("Collecting paper work...");
        }

        private void conductHallwayDuties() {
            System.out.println("Conducting hallway duties...");
        }

        public void performOtherResponsibilities() {
            makeAnnouncements();
            takeAttendence();
            collectPaperWork();
            conductHallwayDuties();
            performOtherResponsibilities();
        }

        public String toString() {
            return "Teacher{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
