pub fn square_of_sum(n: i32) ->i32 {
    fn sum (i: i32) -> i32 { if i==0 { 0 } else { i + sum(i-1) }};
    sum(n).pow(2)
}


pub fn sum_of_squares(n: i32) -> i32 {
    if n==0 {
        0
    } else {
        n.pow(2) + sum_of_squares(n-1)
    }
}

pub fn difference (n: i32) -> i32 {
    (square_of_sum(n) - sum_of_squares(n)).abs()
}
