package aircraftcarrier;

public class Aircraft {

  int currentAmmo;
  int maxAmmo;
  int baseDamage;

  public Aircraft() {
    currentAmmo = 0;
  }

  int fight() {
    int causedDamage = currentAmmo * baseDamage;
    currentAmmo = 0;
    return causedDamage;
  }

  int refill(int receivedAmmo) {
    int remainigRefill = receivedAmmo;
    int emptySlots = maxAmmo - currentAmmo;

    if (emptySlots < remainigRefill) {
      remainigRefill -= emptySlots;
      currentAmmo = maxAmmo;
    } else {
      currentAmmo += remainigRefill;
      remainigRefill = 0;
    }
    return remainigRefill;
  }
}