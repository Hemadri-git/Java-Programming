package tasksGPT;

import java.util.concurrent.locks.ReentrantLock;

class VaccineEligibility {
    private int age;
    private boolean hasHealthCondition;

    public VaccineEligibility(int age, boolean hasHealthCondition) {
        this.age = age;
        this.hasHealthCondition = hasHealthCondition;
    }

    public boolean isEligible() {
        return age >= 18 && (age < 60 || hasHealthCondition);
    }
}

class DoseBooking {
    private boolean booked = false;

    public synchronized void bookDose() {
        if (booked) {
            throw new RuntimeException("Dose already booked.");
        }
        booked = true;
        System.out.println("Dose booked successfully.");
    }

    public synchronized boolean isDoseBooked() {
        return booked;
    }
}

class User {
    String name;
    private VaccineEligibility eligibility;
    private DoseBooking doseBooking;

    public User(String name, int age, boolean hasHealthCondition) {
        this.name = name;
        this.eligibility = new VaccineEligibility(age, hasHealthCondition);
        this.doseBooking = new DoseBooking();
    }

    public boolean isEligible() {
        return eligibility.isEligible();
    }

    public void bookDose() {
        if (!isEligible()) {
            throw new RuntimeException(name + " is not eligible for the vaccine.");
        }
        doseBooking.bookDose();
        System.out.println("Dose booked successfully for " + name);
    }

    public boolean isDoseBooked() {
        return doseBooking.isDoseBooked();
    }
}

public class CoronaVaccineApp {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        User user1 = new User("Ramesh", 45, false);
        User user2 = new User("Suresh", 16, false);

        Thread thread1 = new Thread(() -> {
            lock.lock();
            try {
                if (user1.isEligible()) {
                    user1.bookDose();
                } else {
                    System.out.println(user1.name + " is not eligible for the vaccine.");
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            } finally {
                lock.unlock();
            }
        });

        Thread thread2 = new Thread(() -> {
            lock.lock();
            try {
                if (user2.isEligible()) {
                    user2.bookDose();
                } else {
                    System.out.println(user2.name + " is not eligible for the vaccine.");
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            } finally {
                lock.unlock();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
