pub fn number(s: &str) -> Option<String> {
    let digits_string = s.chars().filter(|&c| c.is_digit(10)).collect::<String>();
    match digits_string.len() {
        10 => Some(digits_string.clone()),
        11 if digits_string.starts_with('1') => { Some(s[1..11].to_string()) }
        _ =>  None }
}

pub fn area_code(s: &str) -> Option<String> {
    match number(s) {
        Some(num) => { let (area, _) = num.split_at(3);
                        Some(area.to_string())},
        None => None
    }
}

pub fn pretty_print(s: &str) -> String {
    match number(s) {
        Some(num) => { let (area, rest) = num.split_at(3);
                        let rest = rest.to_string();
                        let (a, b) = rest.split_at(3);
                        format!("({}) {}-{}", area, a, b) },
        None => "invalid".to_string()
    }
}
