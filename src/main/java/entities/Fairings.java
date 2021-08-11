package entities;

import java.util.List;

public class Fairings {
    public boolean reused;

    public boolean isReused() {
        return reused;
    }

    public void setReused(boolean reused) {
        this.reused = reused;
    }

    public boolean isRecovery_attempt() {
        return recovery_attempt;
    }

    public void setRecovery_attempt(boolean recovery_attempt) {
        this.recovery_attempt = recovery_attempt;
    }

    public boolean isRecovered() {
        return recovered;
    }

    public void setRecovered(boolean recovered) {
        this.recovered = recovered;
    }

    public List<String> getShips() {
        return ships;
    }

    public void setShips(List<String> ships) {
        this.ships = ships;
    }

    public boolean recovery_attempt;
    public boolean recovered;
    public List<String> ships;
}
