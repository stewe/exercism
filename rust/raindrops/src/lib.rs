use std::collections::HashSet;

pub fn raindrops(n: i32) -> String {
    const PPP: [(i32, &'static str); 3] = [(3, "Pling"), (5, "Plang"), (7, "Plong")];
    let prims = prims(n).iter().cloned().collect::<HashSet<i32>>();
    let mut out = PPP.iter().fold(String::new(), |mut acc, &(prim, name)| { if prims.contains(&prim) { acc.push_str(name) }; acc});
    if out.is_empty() { out = n.to_string() }
    out
}

pub fn prims(n: i32) -> Vec<i32> {
    let mut vec = vec![];
    let mut z = n;
    while z > 1 {
        let mut i = 2;
        let mut found = false;
        let mut p = 0;
        while i*i <=z && !found {
            if z%i == 0 {
                found = true;
                p = i;
            } else {
                i += 1;
            }
        }
        if !found {
            p = z;
        }
        vec.push(p);
        z = z/p;
    }
    vec
}
