use std::collections::HashMap;

pub fn hex_to_int(hex: &str) -> Option<u64> {
    let digit_map = [('0', 0), ('1', 1), ('2', 2), ('3', 3), ('4', 4), ('5', 5), ('6', 6), ('7', 7), ('8', 8), ('9', 9), ('a', 10), ('b', 11), ('c', 12), ('d', 13), ('e', 14), ('f', 15)]
                    .iter().fold(HashMap::new(), |mut acc, &(c, v)| {acc.insert(c, v); acc});
    let mut hex = hex.to_string();
    let mut int: u64 = 0;
    for i in 0..hex.len() {
        match digit_map.get(&hex.pop().unwrap()) {
            Some(v) => int += (*v as u64) * 16u64.pow(i as u32),
            None => return None
        }
    }
    Some(int)
}
