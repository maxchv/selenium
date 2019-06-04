const http = require('http');
const url = require('url');
const port = 8000;


const requestHandler = (request, response) => {
    // console.log(request.url);
    if (request.url !== '/favicon.ico') {
        var url_parts = url.parse(request.url, true);
        var query_params = url_parts.query;
        console.log(query_params);
    }
    response.end('Hello Node.js Server!');
}

const server = http.createServer(requestHandler);

server.listen(port, (err) => {
    if (err) {
        return console.error('Что то пошло не так...', err);
    }
    console.log(`Сервер запущен на порте: ${port}`);
})