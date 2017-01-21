use std::collections::HashMap;

pub fn count(nucleotide: char, dna: &str) -> usize {
    dna.chars().filter(|n: &char| *n == nucleotide).count()
}

pub fn nucleotide_counts(strand: &str) -> HashMap<char, usize> {
    let mut map = HashMap::new();
    // map.insert('A', count('A', strand));
    // map.insert('C', count('C', strand));
    // map.insert('G', count('G', strand));
    // map.insert('T', count('T', strand));

    // with this solution the dna strand only needs to be iterated once
    for c in &['A', 'C', 'G', 'T'] { map.insert(*c, 0); }
    for c in strand.chars() {
        *map.get_mut(&c).unwrap() += 1;
    }
    map
}
