const http = require('http');
const url = require('url');
const fs = require('fs');

const port = 8000;


function handleRequest(request, response) {
    // console.log(request.url);
    if (request.url !== '/favicon.ico') {
        console.log(request.method);
        if (request.method.toUpperCase() === 'POST') {

            let body = '';

            request.on('data', chunk => {
                body += chunk.toString(); // convert Buffer to string
            });

            request.on('end', () => {
                console.log("Raw body:" + body);
            });

        }
        else if (request.method.toUpperCase() === "GET") {
            console.log("Requrst URL:" + request.url);

            var query_params = url.parse(request.url, true).query;

            if (query_params.login === undefined)
                console.error("Логин не передан");
            else if (query_params.password === undefined)
                console.error("Пароль не передан");
            else {
                if (query_params.login === 'Admin' && query_params.password === "qwerty") {
                    response.end('Your in site');
                }
                else {
                    response.end("Error login or password");
                }
            }
            console.log(query_params);
        }
    }

    // console.log(__dirname + '\\public\\index.html');
    fs.readFile(__dirname + '\\public\\index.html', (err, data) => {
        if (err) return console.error(err);

        response.writeHeader(200, { "Content-Type": "text/html" });
        response.end(data);
    });
    // response.end(); // Default response from server
}

const server = http.createServer(handleRequest);

server.listen(port, (error) => {
    if (error) {
        return console.error('Что то пошло не так...', error);
    }
    console.log(`Сервер запущен на порте: ${port}`);
})