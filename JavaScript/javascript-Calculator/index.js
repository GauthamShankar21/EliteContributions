// read the numbers and return the result
// as needed, into the direct HTML element itself.

let answer = "";

function precise(x) {
    return Number.parseFloat(x).toPrecision(4);
}

function passParam(arg) {

    switch (arg) {
        case "C":
            answer = "";
            break;

        case "x":
            answer = `${answer}x`;
            break;

        case "<":
            answer = answer.substring(0, answer.length-1);
            break;

        case "+/-":
            answer = String(answer * -1);
            break;

        case "=":
            answer = answer.replaceAll("x", "*");
            answer = answer.replaceAll("÷", "/");

            answer = (eval(answer)).toPrecision(10);
            break;
        
        default:
            answer += `${arg}`;
    
    }

    document.getElementById("result-Section").innerHTML = `${answer}`;

}