// Last updated: 18/06/2026, 23:22:33
1class Solution {
2    public double angleClock(int hour, int minutes) {
3        double minuteAngle = 6.0 * minutes;
4        double hourAngle = 30.0 * (hour % 12) + 0.5 * minutes;
5
6        double diff = Math.abs(hourAngle - minuteAngle);
7
8        return Math.min(diff, 360.0 - diff);
9    }
10}