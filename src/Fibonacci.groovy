/**
 * Created by heiko-linke on 07.02.15.
 */
current = 1
next =    1
10.times {
    print current + ' '
    newCurrent = next
    next = next + current
    current = newCurrent
}
println ''