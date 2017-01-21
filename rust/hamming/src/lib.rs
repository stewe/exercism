pub fn hamming_distance<'a>(a: &'a str, b: &'a str) -> Result<usize, &'a str> {
    if a.len() != b.len() {
        Err("inputs of different length")
    } else {
        Ok(a.chars()
                    .zip(b.chars())
                    .filter(|&(ac, bc)| ac!=bc)
                    .count())
                    // .collect::<Vec<_>>()
                    // .len();
    }
}
