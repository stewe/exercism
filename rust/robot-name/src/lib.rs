extern crate rand;

use rand::*;

pub struct Robot {
    name: String,
}

impl Robot {
    pub fn new() -> Robot {
        Robot { name: gen_name() }
    }

    pub fn name<'a>(&'a self) -> &'a str {
        &self.name
    }

    pub fn reset_name(&mut self) {
        self.name = gen_name();
    }
}

fn gen_name() -> String {
    let mut name = String::with_capacity(5);
    let mut rng = thread_rng();
    let char_low = 'A' as u8;
    let char_high = 'Z' as u8 + 1;
    name.push(rng.gen_range(char_low, char_high) as char);
    name.push(rng.gen_range(char_low, char_high) as char);
    name.push_str(format!("{:03}", rng.gen_range::<u16>(0, 1000)).as_str());
    name
}
