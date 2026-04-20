# Payment Gateway Service

A Spring Boot backend service that integrates multiple payment gateways (Razorpay + Stripe) using a routing strategy.

## Why This Project Stands Out

Instead of integrating only one provider, this service routes traffic intelligently:

- 70% requests to Razorpay
- 30% requests to Stripe

This simulates real-world scenarios like:

- Load distribution
- Provider fallback readiness
- Cost-based routing
- Multi-vendor architecture

## Tech Stack

- Java
- Spring Boot
- Maven
- REST APIs
- Stripe API
- Razorpay API

## Features

- Create payment request API
- Multiple gateway integration
- Strategy pattern based chooser
- Separate gateway implementations
- Stripe webhook handling
- Clean controller + service design
- Easily extensible for new gateways

## Architecture

Client
↓
Controller
↓
Payment Service
↓
Chooser Strategy
↓
Razorpay / Stripe


## What I Learned

- Third-party payment integrations
- Strategy Pattern in backend systems
- Webhook callback handling
- Designing extensible services
- Thinking beyond CRUD apps
