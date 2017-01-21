extern crate difference_of_squares;

use difference_of_squares::*;

fn main() {
    for i in 0..6 {
        println!("{} -> {}",i,  square_of_sum(i));
    }
}
