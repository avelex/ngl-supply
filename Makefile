build:
	docker build -t ngl-supply .

start:
	docker run -p 8090:8090 ngl-supply