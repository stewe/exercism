use std::char::from_digit;

pub fn verse(i: u32) -> String {
    let mut count = String::new();
    let mut plural = String::new();
    let mut instr = String::new();

    match i {
        0 => { count.push_str("No more"); plural.push('s'); instr.push_str("Go to the store and buy some more, 99 bottles of beer on the wall.\n"); } ,
        1 => { count.push(from_digit(i, 10).unwrap()); instr = "Take it down and pass it around, no more bottles of beer on the wall.\n".to_string(); },
        2 => { count.push(from_digit(i, 10).unwrap()); plural.push('s'); instr = format!("Take one down and pass it around, {} bottle of beer on the wall.\n", i-1); }
        _ => { count.push(from_digit(i, 10).unwrap()); plural.push('s'); instr = format!("Take one down and pass it around, {} bottles of beer on the wall.\n", i-1); }
    }
    format!("{} bottle{} of beer on the wall, {} bottle{} of beer.\n",
            count, plural, first_lowercase(&count), plural, ) + &instr
}

pub fn sing(start: u32, end: u32) -> String {
    let mut song = String::new();

    for i in (end..start+1).rev() {
        song.push_str(&verse(i));
        song.push('\n');
    }
    song.pop();
    song
}


fn first_lowercase(input: &String) -> String {
    let (c, rest) = input.split_at(1);
    c.to_lowercase() + rest

}
