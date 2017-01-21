extern crate raindrops;
use raindrops::prims;

fn main() {
    for i in 0..22 {
        println!("{} -> {:?}", i, prims(i));
    }
}
