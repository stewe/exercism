use std::collections::HashMap;
use std::thread::spawn;

pub fn frequency(s: &[&'static str], n: usize) -> HashMap<char, i32> {
    let mut maps = vec![];
    let mut data = (0..n+1).map(|_| Vec::new()).collect::<Vec<Vec<&str>>>();
    for (i, word) in s.iter().enumerate() {
        &data[i%n].push(word);
    }

    for input in data {
        maps.push(spawn(move || {
            let mut map = HashMap::new();
            for word in input {
                word.to_lowercase().chars()
                            .filter(|x| x.is_alphabetic())
                            .fold(&mut map,
                                        |acc, c|
                                        { *(acc.entry(c).or_insert(0)) += 1; acc });
            }
            map
        }));
    }

    let mut res = HashMap::new();
    for handle in maps.into_iter() {
        let map = handle.join().unwrap();
        for (k, v) in map {
            *(res.entry(k).or_insert(0)) += v;
        }
    }
    res
}
